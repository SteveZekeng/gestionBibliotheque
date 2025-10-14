package com.ccaBank.bibliotheque.Controllers;

import com.ccaBank.bibliotheque.Services.DocumentService;
import com.ccaBank.bibliotheque.Entities.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblio/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping
    public Document addDocument(@RequestBody Document document){
        return documentService.createDocument(document);
    }

    @GetMapping("/{id}")
    public Document getDocumentByid(@PathVariable Long id){
        return documentService.findDocumentById(id);
    }

    @GetMapping
    public List<Document> getAllDocuments(){
        return documentService.findAllDocuments();
    }

    @PutMapping("/{id}")
    public Document updateDocumentById(@PathVariable Long id, @RequestBody Document document){
        return documentService.updateDocument(id, document);
    }

    @DeleteMapping("/{id}")
    public void deleteDocumentById(@PathVariable Long id){
        documentService.deleteDocument(id);
    }
}
