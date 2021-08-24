package doctor.form.core.service.impl;


import doctor.form.core.mapper.SeatsMapper;
import doctor.form.core.model.SeatsDto;
import doctor.form.core.repository.SeatsRepository;
import doctor.form.core.repository.UserRepository;
import doctor.form.core.service.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsServiceImpl implements SeatsService {

    @Autowired
    SeatsRepository seatsRepository;

    @Autowired
    SeatsMapper seatsMapper;

    @Override
    public List<SeatsDto> getSeats() {
        return seatsMapper.toDtos(seatsRepository.findAll());

    }
}
