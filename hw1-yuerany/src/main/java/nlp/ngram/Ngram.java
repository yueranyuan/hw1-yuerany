

/* First created by JCasGen Thu Sep 12 20:35:31 EDT 2013 */
package nlp.ngram;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import base.BaseAnnotation;
import nlp.token.TokenList;


/** A single ngram.  An ngram is a list of n consecutive tokens.  Ngrams can be bigrams, trigrams, or beyond.
ex: bigram - 'hello world'
trigram - 'got to go'
5gram - 'the cat in the hat'
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class Ngram extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ngram.class);
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
  protected Ngram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Ngram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Ngram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Ngram(JCas jcas, int begin, int end) {
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
  //* Feature: n

  /** getter for n - gets the number of tokens in this ngram
   * @generated */
  public int getN() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "nlp.ngram.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets the number of tokens in this ngram 
   * @generated */
  public void setN(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "nlp.ngram.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_n, v);}    
   
    
  //*--------------*
  //* Feature: grams

  /** getter for grams - gets the tokens in this ngram
   * @generated */
  public TokenList getGrams() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_grams == null)
      jcasType.jcas.throwFeatMissing("grams", "nlp.ngram.Ngram");
    return (TokenList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_grams)));}
    
  /** setter for grams - sets the tokens in this ngram 
   * @generated */
  public void setGrams(TokenList v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_grams == null)
      jcasType.jcas.throwFeatMissing("grams", "nlp.ngram.Ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_grams, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    