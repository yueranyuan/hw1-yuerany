

/* First created by JCasGen Thu Sep 12 22:15:38 EDT 2013 */
package view;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.StringArray;


/** The description for a particularly tagger or scorer that is being used.  The description contains unstructured information about which tagger to use and with what parameters.
TODO: iterate on descriptions and perhaps refactor as necessary once taggers are developed.
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class Description extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Description.class);
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
  protected Description() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Description(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Description(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets The name of the tagger to use
ex: 'stanford.nlp.tokenizer'
   * @generated */
  public String getName() {
    if (Description_Type.featOkTst && ((Description_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "view.Description");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Description_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets The name of the tagger to use
ex: 'stanford.nlp.tokenizer' 
   * @generated */
  public void setName(String v) {
    if (Description_Type.featOkTst && ((Description_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "view.Description");
    jcasType.ll_cas.ll_setStringValue(addr, ((Description_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: params

  /** getter for params - gets The list of parameters for initializing the tagger.  Because differing third party taggers will have different parameters, this field is left unstructured.
   * @generated */
  public StringArray getParams() {
    if (Description_Type.featOkTst && ((Description_Type)jcasType).casFeat_params == null)
      jcasType.jcas.throwFeatMissing("params", "view.Description");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Description_Type)jcasType).casFeatCode_params)));}
    
  /** setter for params - sets The list of parameters for initializing the tagger.  Because differing third party taggers will have different parameters, this field is left unstructured. 
   * @generated */
  public void setParams(StringArray v) {
    if (Description_Type.featOkTst && ((Description_Type)jcasType).casFeat_params == null)
      jcasType.jcas.throwFeatMissing("params", "view.Description");
    jcasType.ll_cas.ll_setRefValue(addr, ((Description_Type)jcasType).casFeatCode_params, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for params - gets an indexed value - The list of parameters for initializing the tagger.  Because differing third party taggers will have different parameters, this field is left unstructured.
   * @generated */
  public String getParams(int i) {
    if (Description_Type.featOkTst && ((Description_Type)jcasType).casFeat_params == null)
      jcasType.jcas.throwFeatMissing("params", "view.Description");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Description_Type)jcasType).casFeatCode_params), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Description_Type)jcasType).casFeatCode_params), i);}

  /** indexed setter for params - sets an indexed value - The list of parameters for initializing the tagger.  Because differing third party taggers will have different parameters, this field is left unstructured.
   * @generated */
  public void setParams(int i, String v) { 
    if (Description_Type.featOkTst && ((Description_Type)jcasType).casFeat_params == null)
      jcasType.jcas.throwFeatMissing("params", "view.Description");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Description_Type)jcasType).casFeatCode_params), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Description_Type)jcasType).casFeatCode_params), i, v);}
  }

    