// 반복되는 부분 refactor 필수!!

import styled from "styled-components";
import * as S from "components/Reservation/ReservationStyle";
import { Children, useEffect, useState } from "react";
import {
  roomCardClickedState,
  checkInState,
  checkOutState,
  roomPriceState,
  guestState,
} from "recoil/Atoms";
import { useRecoilState, useRecoilValue } from "recoil";
import API from "util/API";
function Reservation() {
  const [isClicked, setIsClicked] = useRecoilState(roomCardClickedState);
  const {
    year: checkInYear,
    month: checkInMonth,
    date: checkInDate,
  } = useRecoilValue(checkInState);
  const {
    year: checkOutYear,
    month: checkOutMonth,
    date: checkOutDate,
  } = useRecoilValue(checkOutState);
  const { min, max } = useRecoilValue(roomPriceState);
  const { adult, child, toddler } = useRecoilValue(guestState);
  const [paymentsData, setPaymentsData] = useState();
  const guests = adult + child + toddler;

  const fetchData = async () => {
    const checkIn = `${checkInYear}-${checkInMonth}-${checkInDate}`;
    const checkOut = `${checkOutYear}-${checkOutMonth}-${checkOutDate}`;
    const data = await API.get.payments(guests, checkIn, checkOut, 1);

    setPaymentsData(data);
    console.log(paymentsData);
  };
  const closeReservationPopUp = (e: MouseEvent): void => {
    const target = e.target as HTMLElement;
    if (isClicked && !target.closest(".reservation-modal")) {
      setIsClicked(false);
    }
  };

  useEffect(() => {
    fetchData();
    document.body.addEventListener("click", closeReservationPopUp);
    return () =>
      document.body.removeEventListener("click", closeReservationPopUp);
  }, [isClicked]);
  return isClicked ? (
    <S.ReservationLayout>
      <div>
        <S.ReservationInfoLayout className="reservation-modal">
          <div className="price-and-review">
            <div className="price-per-night">₩ 70,358 / 박</div>
            <div className="review">후기 127개</div>
          </div>
          <div className="input-information">
            <div className="dates">
              <div className="check-in">
                체크인
                <div className="check-in-out-text">
                  {checkInYear}년 {checkInMonth && checkInMonth + 1}월
                  {checkInDate}일
                </div>
              </div>

              <div className="check-out">
                체크아웃
                <div className="check-in-out-text">
                  {checkOutYear}년 {checkOutMonth && checkOutMonth + 1}월
                  {checkOutDate}일
                </div>
              </div>
            </div>
            <div className="guest-number">
              <div>인원</div>
              <div className="input-guest-number">게스트 {guests}명</div>
            </div>
          </div>
          <button>예약하기</button>
          <div className="notification">
            예약 확정 전에는 요금이 청구되지 않습니다.
          </div>
          <div className="price-detail">
            <div>
              <span>₩ 71,466 * 18박</span>
              <span>₩ 1,322,396</span>
            </div>
            <div>
              <span>4% 주 단위 요금 할인</span>
              <span>- ₩ 55,948</span>
            </div>
            <div>
              <span>청소비</span>
              {/* <span>₩${paymentsData && paymentsData.cleaningFee}</span> */}
            </div>
            <div>
              <span>서비스 수수료</span>
              <span>₩ 182,468</span>
            </div>
            <div>
              <span>숙박세와 수수료</span>
              <span>₩ 18,247</span>
            </div>
          </div>
          <div className="price-total">
            <span>총 합계</span>
            <span>₩ 67,007</span>
          </div>
        </S.ReservationInfoLayout>
      </div>
    </S.ReservationLayout>
  ) : (
    <></>
  );
}

export default Reservation;
