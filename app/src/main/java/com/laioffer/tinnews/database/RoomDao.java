package com.laioffer.tinnews.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.laioffer.tinnews.model.Article;

import java.util.List;



@Dao
public interface RoomDao {
    @Insert
    void saveArticle(Article news);

    @Query("SELECT * FROM article")
    LiveData<List<Article>> getAllArticles();

    // ... 是可以一次删除多个article
    @Delete
    void deleteArticle(Article... article);
}
