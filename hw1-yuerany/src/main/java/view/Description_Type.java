
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

/** The description for a particularly tagger or scorer that is being used.  The description contains unstructured information about which tagger to use and with what parameters.
TODO: iterate on descriptions and perhaps refactor as necessary once taggers are developed.
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * @generated */
public class Description_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Description_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Description_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Description(addr, Description_Type.this);
  			   Description_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Description(addr, Description_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Description.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("view.Description");
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "view.Description");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "view.Description");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_params;
  /** @generated */
  final int     casFeatCode_params;
  /** @generated */ 
  public int getParams(int addr) {
        if (featOkTst && casFeat_params == null)
      jcas.throwFeatMissing("params", "view.Description");
    return ll_cas.ll_getRefValue(addr, casFeatCode_params);
  }
  /** @generated */    
  public void setParams(int addr, int v) {
        if (featOkTst && casFeat_params == null)
      jcas.throwFeatMissing("params", "view.Description");
    ll_cas.ll_setRefValue(addr, casFeatCode_params, v);}
    
   /** @generated */
  public String getParams(int addr, int i) {
        if (featOkTst && casFeat_params == null)
      jcas.throwFeatMissing("params", "view.Description");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_params), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_params), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_params), i);
  }
   
  /** @generated */ 
  public void setParams(int addr, int i, String v) {
        if (featOkTst && casFeat_params == null)
      jcas.throwFeatMissing("params", "view.Description");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_params), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_params), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_params), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Description_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_params = jcas.getRequiredFeatureDE(casType, "params", "uima.cas.StringArray", featOkTst);
    casFeatCode_params  = (null == casFeat_params) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_params).getCode();

  }
}



    