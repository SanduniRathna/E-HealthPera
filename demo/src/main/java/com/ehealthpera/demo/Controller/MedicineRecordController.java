package com.ehealthpera.demo.Controller;

import com.ehealthpera.demo.Dto.MedicineRecodeDTO;
import com.ehealthpera.demo.Entity.MedicineRecord;
import com.ehealthpera.demo.Service.MedicineRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/medicine-record")
@CrossOrigin
public class MedicineRecordController {
    @Autowired
    private MedicineRecordService medicineRecordService;

    //add medicine records by user id
    @PostMapping("/add-medicine")
    public boolean addMedicine(@RequestBody MedicineRecodeDTO medicineRecodeDTO){
        return medicineRecordService.addMedicine(medicineRecodeDTO);
    }

    //get student medicine details
    @GetMapping("get-medicine-record-by-id/{id}")
    public Optional<MedicineRecord> getUserMedicineRecords(@PathVariable String id){
        return medicineRecordService.getUserById(id);
    }


}
