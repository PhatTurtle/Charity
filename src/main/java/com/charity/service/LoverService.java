package com.charity.service;

import com.charity.model.Lover;
import com.charity.repository.LoverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LoverService {
    @Autowired
    private LoverRepository loverRepository;

    public Page<Lover> getAllLoverDonate(int pageNumber){
        int pageSize = 9;
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
        Page<Lover> pageLover = loverRepository.getAllLoverDonate(pageable);
        return pageLover;
    }

}
