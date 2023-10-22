package com.ehealthpera.demo.Service;

import com.ehealthpera.demo.Dto.MedicineRecodeDTO;
import com.ehealthpera.demo.Entity.MedicineRecord;

import java.util.Optional;

public interface MedicineRecordService {
    boolean addMedicine(MedicineRecodeDTO medicineRecodeDTO);

    Optional<MedicineRecord> getUserById(String id);
}
