package com.kagzz.jmix.rys.product.entity;

import java.util.Objects;
import org.assertj.core.api.AbstractObjectAssert;

/**
 * {@link ProductCategory} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class ProductCategoryAssert extends AbstractObjectAssert<ProductCategoryAssert, ProductCategory> {

  /**
   * Creates a new <code>{@link ProductCategoryAssert}</code> to make assertions on actual ProductCategory.
   * @param actual the ProductCategory we want to make assertions on.
   */
  public ProductCategoryAssert(ProductCategory actual) {
    super(actual, ProductCategoryAssert.class);
  }

  /**
   * An entry point for ProductCategoryAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myProductCategory)</code> and get specific assertion with code completion.
   * @param actual the ProductCategory we want to make assertions on.
   * @return a new <code>{@link ProductCategoryAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static ProductCategoryAssert assertThat(ProductCategory actual) {
    return new ProductCategoryAssert(actual);
  }

  /**
   * Verifies that the actual ProductCategory's createdBy is equal to the given one.
   * @param createdBy the given createdBy to compare the actual ProductCategory's createdBy to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's createdBy is not equal to the given one.
   */
  public ProductCategoryAssert hasCreatedBy(String createdBy) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting createdBy of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCreatedBy = actual.getCreatedBy();
    if (!Objects.deepEquals(actualCreatedBy, createdBy)) {
      failWithMessage(assertjErrorMessage, actual, createdBy, actualCreatedBy);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's createdDate is equal to the given one.
   * @param createdDate the given createdDate to compare the actual ProductCategory's createdDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's createdDate is not equal to the given one.
   */
  public ProductCategoryAssert hasCreatedDate(java.util.Date createdDate) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting createdDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Date actualCreatedDate = actual.getCreatedDate();
    if (!Objects.deepEquals(actualCreatedDate, createdDate)) {
      failWithMessage(assertjErrorMessage, actual, createdDate, actualCreatedDate);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's deletedBy is equal to the given one.
   * @param deletedBy the given deletedBy to compare the actual ProductCategory's deletedBy to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's deletedBy is not equal to the given one.
   */
  public ProductCategoryAssert hasDeletedBy(String deletedBy) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting deletedBy of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualDeletedBy = actual.getDeletedBy();
    if (!Objects.deepEquals(actualDeletedBy, deletedBy)) {
      failWithMessage(assertjErrorMessage, actual, deletedBy, actualDeletedBy);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's deletedDate is equal to the given one.
   * @param deletedDate the given deletedDate to compare the actual ProductCategory's deletedDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's deletedDate is not equal to the given one.
   */
  public ProductCategoryAssert hasDeletedDate(java.util.Date deletedDate) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting deletedDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Date actualDeletedDate = actual.getDeletedDate();
    if (!Objects.deepEquals(actualDeletedDate, deletedDate)) {
      failWithMessage(assertjErrorMessage, actual, deletedDate, actualDeletedDate);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's description is equal to the given one.
   * @param description the given description to compare the actual ProductCategory's description to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's description is not equal to the given one.
   */
  public ProductCategoryAssert hasDescription(String description) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting description of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualDescription = actual.getDescription();
    if (!Objects.deepEquals(actualDescription, description)) {
      failWithMessage(assertjErrorMessage, actual, description, actualDescription);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's id is equal to the given one.
   * @param id the given id to compare the actual ProductCategory's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's id is not equal to the given one.
   */
  public ProductCategoryAssert hasId(java.util.UUID id) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.UUID actualId = actual.getId();
    if (!Objects.deepEquals(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's lastModifiedBy is equal to the given one.
   * @param lastModifiedBy the given lastModifiedBy to compare the actual ProductCategory's lastModifiedBy to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's lastModifiedBy is not equal to the given one.
   */
  public ProductCategoryAssert hasLastModifiedBy(String lastModifiedBy) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting lastModifiedBy of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualLastModifiedBy = actual.getLastModifiedBy();
    if (!Objects.deepEquals(actualLastModifiedBy, lastModifiedBy)) {
      failWithMessage(assertjErrorMessage, actual, lastModifiedBy, actualLastModifiedBy);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's lastModifiedDate is equal to the given one.
   * @param lastModifiedDate the given lastModifiedDate to compare the actual ProductCategory's lastModifiedDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's lastModifiedDate is not equal to the given one.
   */
  public ProductCategoryAssert hasLastModifiedDate(java.util.Date lastModifiedDate) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting lastModifiedDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Date actualLastModifiedDate = actual.getLastModifiedDate();
    if (!Objects.deepEquals(actualLastModifiedDate, lastModifiedDate)) {
      failWithMessage(assertjErrorMessage, actual, lastModifiedDate, actualLastModifiedDate);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's name is equal to the given one.
   * @param name the given name to compare the actual ProductCategory's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's name is not equal to the given one.
   */
  public ProductCategoryAssert hasName(String name) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualName = actual.getName();
    if (!Objects.deepEquals(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's tenant is equal to the given one.
   * @param tenant the given tenant to compare the actual ProductCategory's tenant to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's tenant is not equal to the given one.
   */
  public ProductCategoryAssert hasTenant(String tenant) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting tenant of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTenant = actual.getTenant();
    if (!Objects.deepEquals(actualTenant, tenant)) {
      failWithMessage(assertjErrorMessage, actual, tenant, actualTenant);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductCategory's version is equal to the given one.
   * @param version the given version to compare the actual ProductCategory's version to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductCategory's version is not equal to the given one.
   */
  public ProductCategoryAssert hasVersion(Integer version) {
    // check that actual ProductCategory we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting version of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualVersion = actual.getVersion();
    if (!Objects.deepEquals(actualVersion, version)) {
      failWithMessage(assertjErrorMessage, actual, version, actualVersion);
    }

    // return the current assertion for method chaining
    return this;
  }

}