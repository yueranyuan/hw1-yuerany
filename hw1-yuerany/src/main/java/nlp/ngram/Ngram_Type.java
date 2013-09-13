
/* First created by JCasGen Thu Sep 12 20:35:31 EDT 2013 */
package nlp.ngram;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import base.BaseAnnotation_Type;

/** A single ngram.  An ngram is a list of n consecutive tokens.  Ngrams can be bigrams, trigrams, or beyond.
ex: bigram - 'hello world'
trigram - 'got to go'
5gram - 'the cat in the hat'
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * @generated */
public class Ngram_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Ngram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Ngram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Ngram(addr, Ngram_Type.this);
  			   Ngram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Ngram(addr, Ngram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Ngram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("nlp.ngram.Ngram");
 
  /** @generated */
  final Feature casFeat_n;
  /** @generated */
  final int     casFeatCode_n;
  /** @generated */ 
  public int getN(int addr) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "nlp.ngram.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_n);
  }
  /** @generated */    
  public void setN(int addr, int v) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "nlp.ngram.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_n, v);}
    
  
 
  /** @generated */
  final Feature casFeat_grams;
  /** @generated */
  final int     casFeatCode_grams;
  /** @generated */ 
  public int getGrams(int addr) {
        if (featOkTst && casFeat_grams == null)
      jcas.throwFeatMissing("grams", "nlp.ngram.Ngram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_grams);
  }
  /** @generated */    
  public void setGrams(int addr, int v) {
        if (featOkTst && casFeat_grams == null)
      jcas.throwFeatMissing("grams", "nlp.ngram.Ngram");
    ll_cas.ll_setRefValue(addr, casFeatCode_grams, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Ngram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_n = jcas.getRequiredFeatureDE(casType, "n", "uima.cas.Integer", featOkTst);
    casFeatCode_n  = (null == casFeat_n) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_n).getCode();

 
    casFeat_grams = jcas.getRequiredFeatureDE(casType, "grams", "nlp.token.TokenList", featOkTst);
    casFeatCode_grams  = (null == casFeat_grams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_grams).getCode();

  }
}



    