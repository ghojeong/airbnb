import styled from "styled-components";
import { useState } from "react";
// import { FilterKind } from "util/enum"; 타입스크립트 에러 해결 후 적용

const FILTER_STYLE = {
  CHECK_IN: {
    title: "체크인",
    placeholder: "날짜입력",
    width: "15%",
  },
  CHECK_OUT: {
    title: "체크아웃",
    placeholder: "날짜입력",
    width: "15%",
  },
  PRICE: {
    title: "요금",
    placeholder: "금액대 설정",
    width: "20%",
  },
  GUESTS: {
    title: "인원",
    placeholder: "게스트 추가",
    width: "40%",
  },
};

// type SelectFilterProps = {
//   filterType: string,
// };.toLocaleString()
const getFilterContent = (type, state) => {
  switch (type) {
    case "CHECK_IN":
      return `${state.checkInMonth}월 ${state.checkInDate}일`;
    case "CHECK_OUT":
      return `${state.checkOutMonth}월 ${state.checkOutDate}일`;
    case "PRICE":
      return `${state.min.toLocaleString()} ~ ${state.max.toLocaleString()}`;
    case "GUESTS":
      return `게스트 ${state.adult + state.child}명, 유아 ${state.toddler}명`;
    default:
      throw new Error("Unhandled Filter Type");
  }
};

const renderFilterContent = () => {
  //state가 바뀌었는지에 따라서 place holder(기본상태)를 보여주거나 {getFilterContent(filterType, filterState)}를 보여주거나
};

const SelectFilter = ({ filterType, filterState = null }) => {
  const handlerClick = e => {
    console.log(e.target);
    //() => setClicked(x => !x)
  };
  return (
    <>
      <SearchBarBox
        _width={FILTER_STYLE[`${filterType}`].width}
        onClick={handlerClick}
      >
        <SearchBarTitle>{FILTER_STYLE[`${filterType}`].title}</SearchBarTitle>
        <SearchBarText>
          {/* {getFilterContent(filterType, filterState)} */}
        </SearchBarText>
      </SearchBarBox>
    </>
  );
};

const SearchBarBox = styled.div`
  /* background-color: ${props => (props.clicked ? "red" : "blue")}; */
  padding: 2% 0% 2% 3%;
  width: ${props => props._width};
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

export default SelectFilter;
