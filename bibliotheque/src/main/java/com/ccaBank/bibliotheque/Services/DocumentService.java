package com.ccaBank.bibliotheque.Services;

import com.ccaBank.bibliotheque.Repositories.DocumentRepository;
import com.ccaBank.bibliotheque.Entities.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public Document createDocument(Document document) {
        return documentRepository.save(document);
    }

    public List<Document> findAllDocuments() {
        return documentRepository.findAll();
    }

    public Document findDocumentById(Long id) {
        return documentRepository.findById(id).get();
    }

    public Document updateDocument(Long id, Document document) {
        Document docu = documentRepository.findById(id).get();

        docu.setAuteur(document.getAuteur());
        docu.setTypeDocument(document.getTypeDocument());
        docu.setTitre(document.getTitre());
        docu.setDescription(document.getDescription());
        docu.setLocalisation(document.getLocalisation());

        return documentRepository.save(docu);
    }

    public void deleteDocument(Long id) {
        documentRepository.deleteById(id);
    }
}
