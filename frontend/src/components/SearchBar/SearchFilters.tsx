import styled from "styled-components";
import { useState } from "react";
import { ReactComponent as CancelButton } from "image/cancelBtn.svg"; //뭔가..너무 많은데?
import { FilterKind, ActionKind } from "util/enum"; //타입스크립트 에러 해결 후 적용

// type SearchFiltersProps = {
//   filterType: string,
// };.toLocaleString()

type FilterStyleType = {
  [key: string]: filterValue;
};

type filterValue = {
  title: string;
  placeholder: string;
  width: string;
};

const FILTER_STYLE: FilterStyleType = {
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

const getFilterText = (type: string, state: any) => {
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
  //state가 바뀌었는지에 따라서 place holder(기본상태)를 보여주거나 {getFilterText(filterType, filterState)}를 보여주거나
};

type SearchFiltersType = {
  _width: string;
};
type SearchBarType = {
  filterType: string;
  filterState: any;
  calendarDispatch: any;
  setToggle: any;
};

const SearchFilters = ({
  filterType,
  filterState,
  calendarDispatch,
  setToggle,
}: SearchBarType) => {
  const [clickedFilter, setClickedFilter] = useState(null);

  const handleClick = (e: any) => {
    console.dir(e.target);
    setToggle(true);
    //calendarDispatch({ type: ActionKind.setCheckInMonth, payload: 3 });
    //() => setClicked(x => !x)
  };
  return (
    <>
      <FilterBox
        _width={FILTER_STYLE[`${filterType}`].width}
        onClick={handleClick}
      >
        <FilterTitle>{FILTER_STYLE[`${filterType}`].title}</FilterTitle>
        <FilterText>{getFilterText(filterType, filterState)}</FilterText>
      </FilterBox>
    </>
  );
};
type TFilterBox = {
  _width: string;
};

const FilterBox = styled.div`
  padding: 2.5% 0% 2.5% 3%;
  width: ${(props: TFilterBox) => props._width};
  text-align: left;
  border-radius: 60px;
  box-shadow: 5px gray;
  cursor: pointer;
  :hover {
    background-color: #f5f5f7;
    transition: background-color 0.4s;
  }
`;
const FilterTitle = styled.div`
  /* font-size: 1.2rem; */
  font-size: 12px;
  font-weight: bold;
  margin-bottom: 10px;
`;
const FilterText = styled.div`
  /* font-size: 1.6rem; */
  font-size: 16px;
`;

export default SearchFilters;
