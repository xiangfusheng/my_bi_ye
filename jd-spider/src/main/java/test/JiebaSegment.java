package test;

import java.util.List;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.JiebaSegmenter.SegMode;
/**
 * �ɹ�
 * @author xiang
 *
 */
public class JiebaSegment {

	public static List<String> sentenceProcess(String text) {
        JiebaSegmenter segmenter = new JiebaSegmenter();
        return segmenter.sentenceProcess(text);
	}
	
	public static void main(String[] args){
		JiebaSegmenter segmenter = new JiebaSegmenter();
		String text = "��ӡ����";
		 System.out.println(sentenceProcess(text));
	}

}
