

/* First created by JCasGen Thu Sep 12 20:44:24 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** A list of answers to a question
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class AnswerList extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerList.class);
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
  protected AnswerList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets The list of answers for this AnswerList.  The rank assigned to each answer within the answer list must be unique and must be sequential starting at 1.
   * @generated */
  public FSList getAnswers() {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "model.AnswerList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets The list of answers for this AnswerList.  The rank assigned to each answer within the answer list must be unique and must be sequential starting at 1. 
   * @generated */
  public void setAnswers(FSList v) {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "model.AnswerList");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    