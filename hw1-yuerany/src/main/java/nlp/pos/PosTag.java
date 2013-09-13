

/* First created by JCasGen Thu Sep 12 20:28:07 EDT 2013 */
package nlp.pos;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import base.BaseAnnotation;


/** A single part of speech tag produced by a part of speech tagger
ex: 'noun', 'verb'
 * Updated by JCasGen Thu Sep 12 22:28:20 EDT 2013
 * XML source: /home/yueran/11791/hw1-yuerany/src/main/resources/hw1-yuerany-typesystem.xml
 * @generated */
public class PosTag extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PosTag.class);
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
  protected PosTag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PosTag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PosTag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PosTag(JCas jcas, int begin, int end) {
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
  //* Feature: pos

  /** getter for pos - gets The name of the part of speech of this POSTag
   * @generated */
  public String getPos() {
    if (PosTag_Type.featOkTst && ((PosTag_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "nlp.pos.PosTag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PosTag_Type)jcasType).casFeatCode_pos);}
    
  /** setter for pos - sets The name of the part of speech of this POSTag 
   * @generated */
  public void setPos(String v) {
    if (PosTag_Type.featOkTst && ((PosTag_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "nlp.pos.PosTag");
    jcasType.ll_cas.ll_setStringValue(addr, ((PosTag_Type)jcasType).casFeatCode_pos, v);}    
  }

    