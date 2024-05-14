// eslint-disable-next-line no-unused-vars
import React , {useState , useEffect} from 'react'
import { getHospitals } from '../services/api';
const Hospital = () => {
    const [hospitals, setHospitals] = useState([]);
  
    useEffect(() => {
      const fetchData = async () => {
        const data = await getHospitals();
        setHospitals(data);
      };
      fetchData();
    }, []);
  
    return (
      <div>
        <h2>Hospitals</h2>
        <ul>
          {hospitals.map(hospital => (
            <li key={hospital.hospital_id}>{hospital.hospital_name} - Patients: {hospital.patient_count}, Rooms: {hospital.room_count}</li>
          ))}
        </ul>
      </div>
    );
  };
  
  export default Hospital;