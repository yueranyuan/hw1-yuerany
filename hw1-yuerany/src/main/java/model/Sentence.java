

/* First created by JCasGen Thu Sep 12 20:37:50 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import base.BaseAnnotation;


import nlp.ngram.NgramList;
import nlp.token.TokenList;


/** A sentence and all its associated data.  This includes NLP data used to evaluate the sentence.
ex: 'who shot Lincoln?', 'booth shot Lincoln.'
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class Sentence extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: tokens

  /** getter for tokens - gets The tokens of the sentence delimited by spaces and punctuation.  The tokens should be produced by a tokenizer.
ex: 'who shot Lincoln?' has the tokens 'who', 'shot', 'Lincoln'
   * @generated */
  public TokenList getTokens() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "model.Sentence");
    return (TokenList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets The tokens of the sentence delimited by spaces and punctuation.  The tokens should be produced by a tokenizer.
ex: 'who shot Lincoln?' has the tokens 'who', 'shot', 'Lincoln' 
   * @generated */
  public void setTokens(TokenList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "model.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngrams

  /** getter for ngrams - gets The ngrams of the tokens of the sentence.  An ngram is a list of n tokens that appear sequentially in the sentence.  Ngrams can be unigrams (n = 1), bigrams (n = 2), trigrams (n = 3), or more (for larger n).
ex: 'who shot Lincoln?' has three unigram 'who', 'shot', and lincoln', two bigrams 'who shot' and 'shot Lincoln', and a trigram 'who shot Lincoln'.
   * @generated */
  public NgramList getNgrams() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "model.Sentence");
    return (NgramList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_ngrams)));}
    
  /** setter for ngrams - sets The ngrams of the tokens of the sentence.  An ngram is a list of n tokens that appear sequentially in the sentence.  Ngrams can be unigrams (n = 1), bigrams (n = 2), trigrams (n = 3), or more (for larger n).
ex: 'who shot Lincoln?' has three unigram 'who', 'shot', and lincoln', two bigrams 'who shot' and 'shot Lincoln', and a trigram 'who shot Lincoln'. 
   * @generated */
  public void setNgrams(NgramList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "model.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_ngrams, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    