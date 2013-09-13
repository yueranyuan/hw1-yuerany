
/* First created by JCasGen Thu Sep 12 20:17:43 EDT 2013 */
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

import org.apache.uima.jcas.tcas.Annotation_Type;

/** The input for the evaluator program.  This contains the location of the file with the question and answers.
The file must be of the format:
Q <question>
A <correctness> <answer>
...

where <correctness> is 1 for correct and 0 for incorrect.
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * @generated */
public class Input_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Input_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Input_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Input(addr, Input_Type.this);
  			   Input_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Input(addr, Input_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Input.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("view.Input");
 
  /** @generated */
  final Feature casFeat_fileLocation;
  /** @generated */
  final int     casFeatCode_fileLocation;
  /** @generated */ 
  public String getFileLocation(int addr) {
        if (featOkTst && casFeat_fileLocation == null)
      jcas.throwFeatMissing("fileLocation", "view.Input");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fileLocation);
  }
  /** @generated */    
  public void setFileLocation(int addr, String v) {
        if (featOkTst && casFeat_fileLocation == null)
      jcas.throwFeatMissing("fileLocation", "view.Input");
    ll_cas.ll_setStringValue(addr, casFeatCode_fileLocation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Input_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_fileLocation = jcas.getRequiredFeatureDE(casType, "fileLocation", "uima.cas.String", featOkTst);
    casFeatCode_fileLocation  = (null == casFeat_fileLocation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fileLocation).getCode();

  }
}



    