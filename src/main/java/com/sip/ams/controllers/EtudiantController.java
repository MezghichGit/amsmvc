package com.sip.ams.controllers;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sip.ams.entities.*;
@Controller
@RequestMapping("/etudiant")
public class EtudiantController {
	
	@RequestMapping("/list")
	public String listEtudiant(Model m)
	{
		List<Etudiant> students = new ArrayList<>();
		students.add(new Etudiant("Yosri","y@gmail.com",24));
		students.add(new Etudiant("Haitham","h@gmail.com",23));
		students.add(new Etudiant("Amine","a@gmail.com",25));
		m.addAttribute("students", students);
		return "etudiant/listEtudiant";
	}

}
