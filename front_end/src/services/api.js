import axios from 'axios';

const API_URL = 'http://localhost:8081/api';

export const getHospitals = async () => {
  const response = await axios.get(`${API_URL}/hospitals`);
  return response.data;
};