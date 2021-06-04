const END_POINT = "http://airbnb.pyro-squad.com/";

export default API;
// 이거는 제가 데이지의 방식으로 따라가는 것으로.
const END_POINT = "http://airbnb.pyro-squad.com/api/";
const API = {
  get: {
    room: async () => {
      const response = await fetch(
        `${END_POINT}/api/rooms?checkIn=2021-06-10&checkOut=2021-06-11&priceMax=10000&priceMin=100000`
      ).then(res => res.json());
      return response;
    },
    payments: async (adults, checkIn, checkOut, roomId) => {
      const query = `?adults=${adults}&checkIn=${checkIn}&checkOut=${checkOut}&roomId=${roomId}`;
      // `${END_POINT}/payments${query}`
      const response = await fetch(`${END_POINT}payments${query}`, {
        method: "GET",
        headers: { "Content-Type": "application/json" },
      });
      return await response.json();
    },
  },

  post: {
    reservation: async (checkIn, checkOut, login, roomId) => {
      const query = `?checkIn=${checkIn}&checkOut=${checkOut}&login=${login}&roomId=${roomId}`;
      const response = await fetch(`${END_POINT}reservation${query}`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
      });
      return await response.json();
    },
  },
};

export default API;
//내용작성필요, 에러처리 부분입니당
// try {
//   const response = await fetch(`${END_POINT}/games/`, {
//     method: "POST",
//     headers: { "Content-Type": "application/json" },
//   });
//   if (response.status >= 400) {
//   } else {
//   }
// } catch (e) {
//   console.error("e", e);
//   return e;
// }
