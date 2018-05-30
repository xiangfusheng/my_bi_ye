package static_resource.models;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import edu.stanford.nlp.util.logging.Redwood;

/**
 * �ɹ�
 * @author xiang
 *
 */
public class TaggerDemo2  {

  /** A logger for this class */
  private static Redwood.RedwoodChannels log = Redwood.channels(TaggerDemo2.class);

  private TaggerDemo2() {}

  public static void main(String[] args) throws Exception {
	  // Initialize the tagger  �����Ѿ�ѵ���õ�ģ��        
      MaxentTagger tagger = new MaxentTagger("G:/����/workspace/����/jd-spider/src/main/java/static_resource/models/chinese-distsim.tagger");           
      // The sample string          
      String sample = "����� �ܹ� �䶳";  
//      String sample = "����� ϴ�»� ���� �䶳 ��� ���� ���� �õ� ��ѯ ����";
      // The tagged string          
      String tagged = tagger.tagString(sample);   

      // Output the result          
      System.out.println(tagged);
  }

}
