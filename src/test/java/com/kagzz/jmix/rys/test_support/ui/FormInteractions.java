package com.kagzz.jmix.rys.test_support.ui;

import com.kagzz.jmix.rys.product.entity.ProductCategory;
import io.jmix.core.metamodel.datatype.impl.EnumClass;
import io.jmix.ui.component.*;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.util.OperationResult;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FormInteractions {

    private final StandardEditor editor;

    public FormInteractions(StandardEditor editor) {
        this.editor = editor;
    }

    public static FormInteractions of(StandardEditor editor) {
        return new FormInteractions(editor);
    }

    @Nullable
    TextField<String> textField(String componentId) {
        return (TextField<String>) editor.getWindow().getComponent(componentId);
    }
    @Nullable
    TextField<Number> numberField(String componentId) {
        return (TextField<Number>) editor.getWindow().getComponent(componentId);
    }

    @Nullable
    CurrencyField<Number> currencyField(String componentId) {
        return (CurrencyField<Number>) editor.getWindow().getComponent(componentId);
    }

    @Nullable
    TextArea<String> textArea(String componentId) {
        return (TextArea<String>) editor.getWindow().getComponent(componentId);
    }

    ComboBox<EnumClass<String>> comboBoxField(String componentId) {
        return (ComboBox<EnumClass<String>>) editor.getWindow().getComponent(componentId);
    }

    <T> ComboBox<T> entityComboBoxField(String componentId, Class<T> entityClass) {
        return (ComboBox<T>) editor.getWindow().getComponent(componentId);
    }

    @Nullable
    Button button(String buttonId) {
        return Optional.ofNullable((Button) editor.getWindow().getComponent(buttonId)).orElseThrow();
    }

    public void setTextFieldValue(String componentId, String value) {
        textField(componentId).setValue(value);
    }

    public void setTextAreaValue(String componentId, String value) {
        textArea(componentId).setValue(value);
    }
    public void setNumberFieldValue(String componentId, Number value) {
        numberField(componentId).setValue(value);
    }

    public OperationResult saveForm() {
        return editor.closeWithCommit();
    }

    public void setEnumFieldValue(String componentId, EnumClass<String> value) {
        comboBoxField(componentId).setValue(value);
    }

    public void setCurrencyFieldValue(String componentId, BigDecimal value) {
        currencyField(componentId).setValue(value);
    }

    public <T> List<T> getEntityComboBoxValues(String componentId, Class<T> entityClass) {
        return entityComboBoxField(componentId, entityClass).getOptions().getOptions().collect(Collectors.toList());
    }

    public <T> void setEntityComboBoxFieldValue(String componentId, T entity, Class<T> entityClass) {
        ComboBox<T> tComboBox = entityComboBoxField(componentId, entityClass);

        T entityFromComboBox = tComboBox.getOptions().getOptions().filter(t -> t.equals(entity)).findFirst().orElseThrow();

        tComboBox.setValue(entity);
    }

}