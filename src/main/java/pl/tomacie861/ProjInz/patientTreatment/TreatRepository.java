package pl.tomacie861.ProjInz.patientTreatment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.tomacie861.ProjInz.patientInfo.PatientInfoModel;


@Repository
public interface TreatRepository extends JpaRepository<TreatModel,Long> {
	
	
	@Query(value = "select id,pesel,icddisease,icdnbr,icdsubtype,docid from projinz.patienticd10 p where pesel=:pesel and docid=:docid"  , nativeQuery = true)
	public List<TreatModel> selectPatientTreatment(@Param("pesel") Long pesel,@Param("docid") Long docid);
}
