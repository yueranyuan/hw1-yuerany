

/* First created by JCasGen Thu Sep 12 20:40:44 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** An individual answer with its associated information including data used to analyse and evaluate the answer.  An answer must be an English sentence and must have a correctness value.
ex: for the question "who shot Lincoln?"
the answer "Booth shot Lincoln" and is correct.
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class Answer extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: correct

  /** getter for correct - gets Whether this answer is correct according to the Gold Standard.  1 is correct, 0 is incorrect
   * @generated */
  public int getCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "model.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_correct);}
    
  /** setter for correct - sets Whether this answer is correct according to the Gold Standard.  1 is correct, 0 is incorrect 
   * @generated */
  public void setCorrect(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "model.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_correct, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets The score assigned by a scoring algorithm.  The scores must be between 0 and 1.  The closer the score is to 0 the more incorrect the system believes the answer is; the closer the score is to 1 the more correct the system believes the answer is.
   * @generated */
  public float getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "model.Answer");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score assigned by a scoring algorithm.  The scores must be between 0 and 1.  The closer the score is to 0 the more incorrect the system believes the answer is; the closer the score is to 1 the more correct the system believes the answer is. 
   * @generated */
  public void setScore(float v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "model.Answer");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: rank

  /** getter for rank - gets The rank assigned to the answer by the evaluator.  This data is used compute precision.  The rank must be unique for each answer in an AnswerList.  Ranks must be 1 or greater.  A lower rank implies the answer is more likely to be correct.
   * @generated */
  public int getRank() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "model.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_rank);}
    
  /** setter for rank - sets The rank assigned to the answer by the evaluator.  This data is used compute precision.  The rank must be unique for each answer in an AnswerList.  Ranks must be 1 or greater.  A lower rank implies the answer is more likely to be correct. 
   * @generated */
  public void setRank(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "model.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_rank, v);}    
  }

    