import styled from "styled-components";

const SearchBarBox = styled.div`
  padding: 2% 0% 2% 3%;

  text-align: left;
  border-radius: 60px;
  box-shadow: 5px gray;
  cursor: pointer;
  :hover {
    background-color: #f5f5f7;
    transition: background-color 0.4s;
  }
`;
const SearchBarTitle = styled.div`
  /* font-size: 1.2rem; */
  font-size: 12px;
  font-weight: bold;
  margin-bottom: 10px;
`;
const SearchBarText = styled.div`
  /* font-size: 1.6rem; */
  font-size: 16px;
`;

export { SearchBarBox, SearchBarText, SearchBarTitle };
