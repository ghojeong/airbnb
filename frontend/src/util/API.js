const END_POINT = "http://airbnb.pyro-squad.com/";
const API = {
    get: {
        room: async () => {
            const response = await fetch(`${END_POINT}/api/rooms?checkIn=2021-06-10&checkOut=2021-06-11&priceMax=10000&priceMin=100000`)
            .then(res => res.json())
            return response;
        },
        graph: async () => {
            const response = await fetch(`${END_POINT}/api/graph`);
            return await response.json();
        },
    }
}

export default API;