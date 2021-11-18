package com.employee.ies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.employee.ies.model.ProductQuote;
import com.employee.ies.model.Quote;
import com.employee.ies.model.QuoteService;
import com.employee.ies.model.newQuote;

@RestController
public class QuoteController {
    @Autowired
    private QuoteService service;

    @Autowired
    private ProductQuote service2;

    
    @PostMapping("/addQuote")
    public Quote newQuotes( @RequestBody newQuote m) {
        return service.saveQuote(new Quote (m.getQuote(),service2.getMovieById(m.getShowId())));
    }


    @GetMapping("/quote")
    public Quote findAllQuotes() {
        List<Quote> a = service.getQuotes();
        Random r = new Random();
		int result = r.nextInt(a.size());
        Quote ret = a.get(result);
        return ret;
    }

    @GetMapping("/quotes")
    public Quote findQuoteById(@RequestParam(value = "show")  int id) {
        List<Quote> a = service.getQuotes();
        List<Quote> rets= new ArrayList<>();
        for (Quote qu: a){
            if (qu.getOrder().getId() == id ){
                rets.add(qu);
            }
        }
        Random r = new Random();
		int result = r.nextInt(rets.size());
        Quote ret = rets.get(result);
        return ret;
    }



    @PutMapping("/updateQuote")
    public Quote updateQuote(@RequestBody Quote product) {
        return service.updateQuote(product);
    }

  
}
