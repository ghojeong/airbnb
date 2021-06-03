// 이거는 제가 데이지의 방식으로 따라가는 것으로.
const END_POINT = "http://airbnb.pyro-squad.com/";
const API = {
  get: {
    prices: async () => {
      const response = await fetch(`${END_POINT}/teams`);
      return await response.json();
    },
  },
  post: {
    gamesAway: async () => {
      //내용작성필요, 에러처리 부분입니당
      try {
        const response = await fetch(
          `${END_POINT}/games/away?${parse.join("&")}`,
          {
            method: "POST",
            headers: { "Content-Type": "application/json" },
          }
        );

        if (response.status >= 400) {
        } else {
        }
      } catch (e) {
        console.error("e", e);
        return e;
      }
    },
  },
};

export default API;
