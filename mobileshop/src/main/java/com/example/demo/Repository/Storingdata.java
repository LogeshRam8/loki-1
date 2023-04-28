package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Mobilegadgets;

public interface Storingdata extends JpaRepository<Mobilegadgets,Integer> {

	
}
