package com.ehealthpera.demo.Service.impl;

import com.ehealthpera.demo.Dto.MedicineRecodeDTO;
import com.ehealthpera.demo.Entity.MedicineRecord;
import com.ehealthpera.demo.Repository.MedicineRecordRepo;
import com.ehealthpera.demo.Service.MedicineRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicineRecordImpl implements MedicineRecordService {
    @Autowired
    private MedicineRecordRepo medicineRecordRepo;

    //add medicine recode to medicine record table
    @Override
    public boolean addMedicine(MedicineRecodeDTO medicineRecodeDTO){
        MedicineRecord medicineRecord1 = new MedicineRecord(
                medicineRecodeDTO.getMedicineIdDTO(),
                medicineRecodeDTO.getUser(),
                medicineRecodeDTO.getMedicineRecords()
        );
        medicineRecordRepo.save(medicineRecord1);
        return true;
    }

    //get user medicine records by id
    @Override
    public Optional<MedicineRecord> getUserById(String id){
        return medicineRecordRepo.getUserMedicineRecordById(id);
    }
}
