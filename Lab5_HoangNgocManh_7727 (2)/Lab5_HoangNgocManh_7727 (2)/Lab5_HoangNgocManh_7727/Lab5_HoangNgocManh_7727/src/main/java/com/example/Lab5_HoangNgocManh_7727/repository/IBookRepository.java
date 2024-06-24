package com.example.Lab5_HoangNgocManh_7727.repository;

import com.example.Lab5_HoangNgocManh_7727.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IBookRepository extends JpaRepository<Book, Long> {


}
