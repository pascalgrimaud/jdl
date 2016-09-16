/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.jdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.EnumField#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.EnumField#getValidators <em>Validators</em>}</li>
 * </ul>
 *
 * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getEnumField()
 * @model
 * @generated
 */
public interface EnumField extends Field
{
  /**
   * Returns the value of the '<em><b>Enum Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Type</em>' reference.
   * @see #setEnumType(EnumType)
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getEnumField_EnumType()
   * @model
   * @generated
   */
  EnumType getEnumType();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.dsl.jdl.EnumField#getEnumType <em>Enum Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Type</em>' reference.
   * @see #getEnumType()
   * @generated
   */
  void setEnumType(EnumType value);

  /**
   * Returns the value of the '<em><b>Validators</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validators</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validators</em>' containment reference.
   * @see #setValidators(RequiredValidator)
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getEnumField_Validators()
   * @model containment="true"
   * @generated
   */
  RequiredValidator getValidators();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.dsl.jdl.EnumField#getValidators <em>Validators</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validators</em>' containment reference.
   * @see #getValidators()
   * @generated
   */
  void setValidators(RequiredValidator value);

} // EnumField
