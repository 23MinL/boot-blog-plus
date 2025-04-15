package org.example.bootblogplus.model.form;

import org.example.bootblogplus.model.entity.Article;

public record ArticleForm(String title, String content) {
    public Article formToEntity() {
        Article article = new Article();
        article.setTitle(this.title);
        article.setContent(this.content);
        return article;
    }
    public static ArticleForm empty() {
        // 시맨틱 코딩
        return new ArticleForm("", "");
    }
}
