

/* First created by JCasGen Thu Sep 12 20:50:23 EDT 2013 */
package view;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** The output of the evaluator which is a single precision score.
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class Output extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Output.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Output() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Output(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Output(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets This score measures the precentage of the top N answers ranked by the program that were actually correct.  The precision should be a number between 0 and 1.
   * @generated */
  public float getPrecision() {
    if (Output_Type.featOkTst && ((Output_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "view.Output");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Output_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets This score measures the precentage of the top N answers ranked by the program that were actually correct.  The precision should be a number between 0 and 1. 
   * @generated */
  public void setPrecision(float v) {
    if (Output_Type.featOkTst && ((Output_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "view.Output");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Output_Type)jcasType).casFeatCode_precision, v);}    
  }

    