

/* First created by JCasGen Thu Sep 12 20:17:43 EDT 2013 */
package view;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


import org.apache.uima.jcas.tcas.Annotation;


/** The input for the evaluator program.  This contains the location of the file with the question and answers.
The file must be of the format:
Q <question>
A <correctness> <answer>
...

where <correctness> is 1 for correct and 0 for incorrect.
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class Input extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Input.class);
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
  protected Input() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Input(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Input(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: fileLocation

  /** getter for fileLocation - gets this is the file location of the file containing the question and answers to be evaluated.  This should be a valid file location.  The file must be of type .txt
The file must be of the format:
Q <question>
A <correctness> <answer>
...

where <correctness> is 1 if the answer is correct and 0 if the answer is incorrect
   * @generated */
  public String getFileLocation() {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_fileLocation == null)
      jcasType.jcas.throwFeatMissing("fileLocation", "view.Input");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Input_Type)jcasType).casFeatCode_fileLocation);}
    
  /** setter for fileLocation - sets this is the file location of the file containing the question and answers to be evaluated.  This should be a valid file location.  The file must be of type .txt
The file must be of the format:
Q <question>
A <correctness> <answer>
...

where <correctness> is 1 if the answer is correct and 0 if the answer is incorrect 
   * @generated */
  public void setFileLocation(String v) {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_fileLocation == null)
      jcasType.jcas.throwFeatMissing("fileLocation", "view.Input");
    jcasType.ll_cas.ll_setStringValue(addr, ((Input_Type)jcasType).casFeatCode_fileLocation, v);}    
  }

    