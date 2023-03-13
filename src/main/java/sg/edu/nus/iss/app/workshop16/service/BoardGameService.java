package sg.edu.nus.iss.app.workshop16.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.app.workshop16.model.Mastermind;
import sg.edu.nus.iss.app.workshop16.repository.BoardGameRepo;

@Service
public class BoardGameService {
    @Autowired
    private BoardGameRepo bgRepo;

    public int saveGame(final Mastermind md){
        return bgRepo.saveGame(md);
    }
}
