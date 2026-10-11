package com.BharatBagHouse.service;

import com.BharatBagHouse.modal.User;
import com.BharatBagHouse.payload.dto.StoreDTO;

import java.util.List;

public interface StoreService {

    StoreDTO createStore(StoreDTO storeDTO, User user);
    StoreDTO getStoreById(Long id);
    List<StoreDTO> getAllStores();
    StoreDTO getStoreByAdmin();
    StoreDTO updateStore(StoreDTO storeDTO, User user);
}
