package lexicon;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import util.Util;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

/**
 * ��ȡ����
 * @author xiang
 *
 */
public class Lexicon {

	public static void main(String[] args) throws Exception {
		String base = Util.getCLassPath();
		//ԭ��λ��
		BufferedReader sourceBr = Util.getBufferedReaderByPath(base + "lexicon/data/source.txt");
		//��һ������λ��
		BufferedWriter verbBw = Util.getBufferedWriterByPath(base + "lexicon/data/verbLexicon.txt");
		//�����ע���
		BufferedWriter verbTaggedBw = Util.getBufferedWriterByPath(base + "lexicon/data/verbTagged.txt");
		String line = null;
		
		//���Ա�ע
		MaxentTagger tagger = new MaxentTagger(Util.getCLassPath()+"static_resource/models/chinese-distsim.tagger");           
	     
		while((line = sourceBr.readLine()) != null){
			String tagged = tagger.tagString(line);
			if(tagged.contains("#VV")){
				verbBw.write(line + "\n");
				verbTaggedBw.write(tagged + "\n");
			}
		}
		verbBw.close();
		sourceBr.close();
		verbTaggedBw.close();

	}

}
