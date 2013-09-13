

/* First created by JCasGen Thu Sep 12 22:15:38 EDT 2013 */
package view;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** The specifications for the taggers and scorers used by the program.  This is used to initialize the program.
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class ProgramDescription extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ProgramDescription.class);
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
  protected ProgramDescription() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ProgramDescription(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ProgramDescription(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokenizerDescription

  /** getter for tokenizerDescription - gets specifications for the tokenizer used in the pipeline
   * @generated */
  public Description getTokenizerDescription() {
    if (ProgramDescription_Type.featOkTst && ((ProgramDescription_Type)jcasType).casFeat_tokenizerDescription == null)
      jcasType.jcas.throwFeatMissing("tokenizerDescription", "view.ProgramDescription");
    return (Description)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProgramDescription_Type)jcasType).casFeatCode_tokenizerDescription)));}
    
  /** setter for tokenizerDescription - sets specifications for the tokenizer used in the pipeline 
   * @generated */
  public void setTokenizerDescription(Description v) {
    if (ProgramDescription_Type.featOkTst && ((ProgramDescription_Type)jcasType).casFeat_tokenizerDescription == null)
      jcasType.jcas.throwFeatMissing("tokenizerDescription", "view.ProgramDescription");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProgramDescription_Type)jcasType).casFeatCode_tokenizerDescription, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: posTaggerDescription

  /** getter for posTaggerDescription - gets descriptions for the pos tagger used in the pipeline
   * @generated */
  public Description getPosTaggerDescription() {
    if (ProgramDescription_Type.featOkTst && ((ProgramDescription_Type)jcasType).casFeat_posTaggerDescription == null)
      jcasType.jcas.throwFeatMissing("posTaggerDescription", "view.ProgramDescription");
    return (Description)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProgramDescription_Type)jcasType).casFeatCode_posTaggerDescription)));}
    
  /** setter for posTaggerDescription - sets descriptions for the pos tagger used in the pipeline 
   * @generated */
  public void setPosTaggerDescription(Description v) {
    if (ProgramDescription_Type.featOkTst && ((ProgramDescription_Type)jcasType).casFeat_posTaggerDescription == null)
      jcasType.jcas.throwFeatMissing("posTaggerDescription", "view.ProgramDescription");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProgramDescription_Type)jcasType).casFeatCode_posTaggerDescription, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngramTaggerDescription

  /** getter for ngramTaggerDescription - gets description for the ngram tagger used in the pipeline
   * @generated */
  public Description getNgramTaggerDescription() {
    if (ProgramDescription_Type.featOkTst && ((ProgramDescription_Type)jcasType).casFeat_ngramTaggerDescription == null)
      jcasType.jcas.throwFeatMissing("ngramTaggerDescription", "view.ProgramDescription");
    return (Description)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProgramDescription_Type)jcasType).casFeatCode_ngramTaggerDescription)));}
    
  /** setter for ngramTaggerDescription - sets description for the ngram tagger used in the pipeline 
   * @generated */
  public void setNgramTaggerDescription(Description v) {
    if (ProgramDescription_Type.featOkTst && ((ProgramDescription_Type)jcasType).casFeat_ngramTaggerDescription == null)
      jcasType.jcas.throwFeatMissing("ngramTaggerDescription", "view.ProgramDescription");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProgramDescription_Type)jcasType).casFeatCode_ngramTaggerDescription, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: scorerDescription

  /** getter for scorerDescription - gets description for the scorer which computes scores for the various answers given the features computed in the pipeline.
   * @generated */
  public Description getScorerDescription() {
    if (ProgramDescription_Type.featOkTst && ((ProgramDescription_Type)jcasType).casFeat_scorerDescription == null)
      jcasType.jcas.throwFeatMissing("scorerDescription", "view.ProgramDescription");
    return (Description)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProgramDescription_Type)jcasType).casFeatCode_scorerDescription)));}
    
  /** setter for scorerDescription - sets description for the scorer which computes scores for the various answers given the features computed in the pipeline. 
   * @generated */
  public void setScorerDescription(Description v) {
    if (ProgramDescription_Type.featOkTst && ((ProgramDescription_Type)jcasType).casFeat_scorerDescription == null)
      jcasType.jcas.throwFeatMissing("scorerDescription", "view.ProgramDescription");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProgramDescription_Type)jcasType).casFeatCode_scorerDescription, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    