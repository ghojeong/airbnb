import styled from "styled-components";
import { useState, useReducer } from "react";
import Calendar from "components/Calendar/Calendar";
import Guests from "components/Guests/Guests";
import RoomPrice from "components/RoomPrice/RoomPrice";
import SearchFilter from "components/SearchBar/SearchFilter";
import {
  CalendarState,
  CalendarAction,
  PriceState,
  PriceAction,
  GuestsState,
  GuestsAction,
} from "util/type/searchBarType";
import { ReactComponent as CancelButton } from "image/cancelBtn.svg"; //뭔가..너무 많은데?
import { ReactComponent as SmallSearchBtn } from "image/smallSearchBtn.svg";
import { ReactComponent as MediumSearchBtn } from "image/mediumSearchBtn.svg";
import { FilterKind, ActionKind } from "util/enum";

const calendarReducer = (
  state: CalendarState,
  action: CalendarAction
): CalendarState => {
  switch (action.type) {
    case ActionKind.setCheckInMonth:
      return {
        ...state,
        checkInMonth: action.payload,
      };
    case ActionKind.setCheckInDate:
      return {
        ...state,
        checkInDate: action.payload,
      };
    case ActionKind.setCheckOutMonth:
      return {
        ...state,
        checkOutMonth: action.payload,
      };
    case ActionKind.setCheckOutDate:
      return {
        ...state,
        checkOutDate: action.payload,
      };
    case ActionKind.reset:
      return {
        ...initialState.calendar,
      };
    default:
      throw new Error("Unhandled action");
  }
};
const priceReducer = (state: PriceState, action: PriceAction): PriceState => {
  switch (action.type) {
    case ActionKind.setPriceMin:
      return {
        ...state,
        min: action.payload,
      };
    case ActionKind.setPriceMax:
      return {
        ...state,
        max: action.payload,
      };
    case ActionKind.reset:
      return {
        ...initialState.price,
      };
    default:
      throw new Error("Unhandled action");
  }
};
const guestsReducer = (
  state: GuestsState,
  action: GuestsAction
): GuestsState => {
  switch (action.type) {
    case ActionKind.setGuestsAdult:
      return {
        ...state,
        adult: action.payload,
      };
    case ActionKind.setGuestsChild:
      return {
        ...state,
        child: action.payload,
      };
    case ActionKind.setGuestsToddler:
      return {
        ...state,
        toddler: action.payload,
      };
    case ActionKind.reset:
      return {
        ...initialState.guests,
      };
    default:
      throw new Error("Unhandled action");
  }
};
const initialState = {
  calendar: {
    checkInMonth: 1,
    checkInDate: 1,
    checkOutMonth: 1,
    checkOutDate: 1,
  },
  price: { min: 0, max: 0 },
  guests: { adult: 0, child: 0, toddler: 0 },
};

const SearchBar = () => {
  const [calendarState, calendarDispatch] = useReducer(
    calendarReducer,
    initialState.calendar
  );

  const [priceState, priceDispatch] = useReducer(
    priceReducer,
    initialState.price
  );

  const [guestsState, guestsDispatch] = useReducer(
    guestsReducer,
    initialState.guests
  );

  const getFilterState = (type: string) => {
    switch (type) {
      case "CHECK_IN" || "CHECK_OUT":
        return calendarState;
      case "PRICE":
        return priceState;
      case "GUESTS":
        return guestsState;
      default:
        throw new Error("Unhandled action???"); //왜 여기로 들어감?
    }
  };
  //취소 버튼 눌렀을 때 상태 리셋을 어떻게 할 것인가?
  const SEARCH_FILTER = ["CHECK_IN", "CHECK_OUT", "PRICE", "GUESTS"];

  return (
    <SearchBarLayout>
      <SearchBarContainer>
        <SearchBarDiv>
          {SEARCH_FILTER.map((type, idx) => (
            <SearchFilter
              key={`filter-${idx}`}
              filterType={type}
              // filterState={getFilterState(type)}
            />
          ))}
        </SearchBarDiv>
        {/* <CancelButton /> */}
        <SearchBarButton>검색</SearchBarButton>
        <SmallSearchButton />
        <MediumSearchButton />
      </SearchBarContainer>
      <Calendar dispatch={calendarDispatch} />
      <RoomPrice />
      <Guests />
    </SearchBarLayout>
  );
};
const MediumSearchButton = styled(MediumSearchBtn)`
  position: absolute;
  right: 1%;
  top: 20%;
`;
const SmallSearchButton = styled(SmallSearchBtn)`
  position: absolute;
  right: 1%;
  top: 20%;
`;
//검색 이라는 글씨를 넣었다 뺐다해야됨

const SearchBarDiv = styled.div`
  display: flex;
  justify-content: space-between;

  width: 100%;
  position: relative;
`;
const SearchBarButton = styled.button`
  position: absolute;
  right: 0;
  top: 20%;
  width: 10%;
  padding: 8px 16px 8px 8px;
  /* width: 90px; */
  height: 42px;
  cursor: pointer;

  background: #e84c60;
  color: white;
  font-weight: bold;
  font-size: 1.2rem;
  border: none;
  border-radius: 30px;
  margin: 0 1%;
`;

const SearchBarContainer = styled.div`
  position: relative;
  display: flex;
  width: 100%;
  height: 76px;
  margin: 2rem auto 0 auto;
  background: #ffffff;
  border: 1px solid #bdbdbd;
  border-radius: 60px;

  @media (max-width: 1024px) {
    margin: 0 auto;
    width: 100%;
  }
`;

const SearchBarLayout = styled.div`
  width: 60%; //반응형 단위로
  display: flex;
  margin: 0 auto;
  flex-direction: column;
  align-items: center;
`;

export default SearchBar;
