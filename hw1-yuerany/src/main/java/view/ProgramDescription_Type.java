
/* First created by JCasGen Thu Sep 12 22:15:38 EDT 2013 */
package view;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** The specifications for the taggers and scorers used by the program.  This is used to initialize the program.
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * @generated */
public class ProgramDescription_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ProgramDescription_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ProgramDescription_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ProgramDescription(addr, ProgramDescription_Type.this);
  			   ProgramDescription_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ProgramDescription(addr, ProgramDescription_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ProgramDescription.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("view.ProgramDescription");
 
  /** @generated */
  final Feature casFeat_tokenizerDescription;
  /** @generated */
  final int     casFeatCode_tokenizerDescription;
  /** @generated */ 
  public int getTokenizerDescription(int addr) {
        if (featOkTst && casFeat_tokenizerDescription == null)
      jcas.throwFeatMissing("tokenizerDescription", "view.ProgramDescription");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenizerDescription);
  }
  /** @generated */    
  public void setTokenizerDescription(int addr, int v) {
        if (featOkTst && casFeat_tokenizerDescription == null)
      jcas.throwFeatMissing("tokenizerDescription", "view.ProgramDescription");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenizerDescription, v);}
    
  
 
  /** @generated */
  final Feature casFeat_posTaggerDescription;
  /** @generated */
  final int     casFeatCode_posTaggerDescription;
  /** @generated */ 
  public int getPosTaggerDescription(int addr) {
        if (featOkTst && casFeat_posTaggerDescription == null)
      jcas.throwFeatMissing("posTaggerDescription", "view.ProgramDescription");
    return ll_cas.ll_getRefValue(addr, casFeatCode_posTaggerDescription);
  }
  /** @generated */    
  public void setPosTaggerDescription(int addr, int v) {
        if (featOkTst && casFeat_posTaggerDescription == null)
      jcas.throwFeatMissing("posTaggerDescription", "view.ProgramDescription");
    ll_cas.ll_setRefValue(addr, casFeatCode_posTaggerDescription, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ngramTaggerDescription;
  /** @generated */
  final int     casFeatCode_ngramTaggerDescription;
  /** @generated */ 
  public int getNgramTaggerDescription(int addr) {
        if (featOkTst && casFeat_ngramTaggerDescription == null)
      jcas.throwFeatMissing("ngramTaggerDescription", "view.ProgramDescription");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngramTaggerDescription);
  }
  /** @generated */    
  public void setNgramTaggerDescription(int addr, int v) {
        if (featOkTst && casFeat_ngramTaggerDescription == null)
      jcas.throwFeatMissing("ngramTaggerDescription", "view.ProgramDescription");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngramTaggerDescription, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scorerDescription;
  /** @generated */
  final int     casFeatCode_scorerDescription;
  /** @generated */ 
  public int getScorerDescription(int addr) {
        if (featOkTst && casFeat_scorerDescription == null)
      jcas.throwFeatMissing("scorerDescription", "view.ProgramDescription");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scorerDescription);
  }
  /** @generated */    
  public void setScorerDescription(int addr, int v) {
        if (featOkTst && casFeat_scorerDescription == null)
      jcas.throwFeatMissing("scorerDescription", "view.ProgramDescription");
    ll_cas.ll_setRefValue(addr, casFeatCode_scorerDescription, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ProgramDescription_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenizerDescription = jcas.getRequiredFeatureDE(casType, "tokenizerDescription", "view.Description", featOkTst);
    casFeatCode_tokenizerDescription  = (null == casFeat_tokenizerDescription) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenizerDescription).getCode();

 
    casFeat_posTaggerDescription = jcas.getRequiredFeatureDE(casType, "posTaggerDescription", "view.Description", featOkTst);
    casFeatCode_posTaggerDescription  = (null == casFeat_posTaggerDescription) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_posTaggerDescription).getCode();

 
    casFeat_ngramTaggerDescription = jcas.getRequiredFeatureDE(casType, "ngramTaggerDescription", "view.Description", featOkTst);
    casFeatCode_ngramTaggerDescription  = (null == casFeat_ngramTaggerDescription) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngramTaggerDescription).getCode();

 
    casFeat_scorerDescription = jcas.getRequiredFeatureDE(casType, "scorerDescription", "view.Description", featOkTst);
    casFeatCode_scorerDescription  = (null == casFeat_scorerDescription) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scorerDescription).getCode();

  }
}



    