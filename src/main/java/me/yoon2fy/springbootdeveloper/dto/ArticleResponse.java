// 글 목록 조회용 API 구현
package me.yoon2fy.springbootdeveloper.dto;

import lombok.Getter;
import me.yoon2fy.springbootdeveloper.domain.Article;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
