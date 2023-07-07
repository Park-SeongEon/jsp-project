package sec03.brd01;

import java.sql.Date;

import lombok.Data;

@Data
public class ArticleVO 
{
	private int lever;
	private int articleNO;
	private int parentNO;
	private String title;
	private String content;
	private String imageFileName;
	private String id;
	private Date writeDate;
	
	public ArticleVO()
	{
	}
	
	public ArticleVO(int level, int articleNO, int parentNO, String title, String content,
				           String imageFileName, String id) {
		
		this.lever = level;
		this.articleNO = articleNO;
		this.parentNO = parentNO;
		this.title = title;
		this.content = content;
		this.imageFileName = imageFileName;
		this.id = id;
	}
		
	
	

}
