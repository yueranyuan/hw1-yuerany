

/* First created by JCasGen Thu Sep 12 20:44:24 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import base.BaseAnnotation;


/** An element to be evaluated by the program.  This element consists of a question and a list of possible answers.  The answers must be annotated with correctness.  This data should be derived from a text file containing this information.
ex:
question: 'who shot lincoln?'
answer1: 'booth shot lincoln.'
answer2: 'lincoln shot booth.'
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class TestElement extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TestElement.class);
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
  protected TestElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TestElement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TestElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TestElement(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: question

  /** getter for question - gets The question of the TestElement.  The question must be one sentence and must be in English.  The question must end in a question mark.
ex: 'who shot Lincoln?'
   * @generated */
  public Question getQuestion() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "model.TestElement");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets The question of the TestElement.  The question must be one sentence and must be in English.  The question must end in a question mark.
ex: 'who shot Lincoln?' 
   * @generated */
  public void setQuestion(Question v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "model.TestElement");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets A list of possible answers to be evaluated for the question of the TestElement.
   * @generated */
  public AnswerList getAnswers() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "model.TestElement");
    return (AnswerList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets A list of possible answers to be evaluated for the question of the TestElement. 
   * @generated */
  public void setAnswers(AnswerList v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "model.TestElement");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets The overall metric with which we evaluate our system's performance on this test element.  The precision metric is a float between 0 and 1 and represents the percentage of the top N answers as ranked by our system that are actually correct.  (N being the number of actually correct answers in total).
   * @generated */
  public float getPrecision() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "model.TestElement");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((TestElement_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets The overall metric with which we evaluate our system's performance on this test element.  The precision metric is a float between 0 and 1 and represents the percentage of the top N answers as ranked by our system that are actually correct.  (N being the number of actually correct answers in total). 
   * @generated */
  public void setPrecision(float v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "model.TestElement");
    jcasType.ll_cas.ll_setFloatValue(addr, ((TestElement_Type)jcasType).casFeatCode_precision, v);}    
  }

    