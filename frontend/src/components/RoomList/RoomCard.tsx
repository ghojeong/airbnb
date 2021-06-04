import styled from "styled-components";
import { useEffect } from 'react';
import { HiOutlineHeart } from 'react-icons/hi';
import { BsStarFill } from 'react-icons/bs';
import { useSetRecoilState } from "recoil";
import { roomCardClickedState, selectedRoomCardState } from 'recoil/Atoms'

type Room = {
    id: number;
    thumImage: string;
    roomType: string;
    roomName:string;
    roomLabel: string;
    starRating: number;
    reviewLabel: string;
    price: number;
}

type RoomInformation = {
    roomInfo: Room;
    // onClick: (event: React.MouseEvent<Element, MouseEvent>) => void;
}

const RoomCard = ({roomInfo: { id, thumImage, roomType, roomName, roomLabel, starRating, reviewLabel, price }}: RoomInformation) => {
    const setIsClicked = useSetRecoilState(roomCardClickedState);
    const setSelectedRoomCard = useSetRecoilState(selectedRoomCardState);
    const popReservationModal = (e: React.MouseEvent<Element, MouseEvent>) => {
        const target = e.target as HTMLElement;
        const targetId = target.id;
        console.log(targetId);
        setIsClicked(true);
        setSelectedRoomCard(targetId);
    }
    return (
    <RoomCardLayout onClick={popReservationModal} className="room-card">
        <div>
            <img src={thumImage}></img>
        </div>
        <RoomCardInfoLayout>
            <div className="upper-container">
                <div className="room-type">{roomType}
                    <button><HiOutlineHeart className="heart-icon"/></button>
                </div>
                <div className="room-name">{roomName}</div>
                <div className="room-label">{roomLabel}</div>
            </div>
            <div className="lower-container">
                <div className="price-per-night">₩{price} / 박</div>
                <div className="total-price-and-rating">
                    <div><BsStarFill color="red" className="star-icon"/>{starRating} {reviewLabel})</div>
                    <div className="total-price">총액 ₩1,493,159</div>
                </div>
            </div>
        </RoomCardInfoLayout>
    </RoomCardLayout>
)};

const RoomCardLayout = styled.div`
    /* border: 1px solid pink; */
    display: flex;
    z-index: 99;

    & > div {
        width: 50%;
        padding: 2rem;
        border-bottom: 1px solid #c9c8c8;
    }

    img {
        width: 35rem;
        height: 25rem;
        border-radius: 20px;
    }
`
const RoomCardInfoLayout = styled.div`
    .room-type {
        display: flex;
        font-size: 1.5rem;
        padding: 0.5rem;
        color: #888;

        button {
            margin-left: auto;
            border: none;
            background-color: transparent;
            cursor: pointer;
        }

        .heart-icon {
            font-size: 2rem;
        }
    }

    .room-name {
        font-size: 1.5rem;
        padding: 0.5rem;
    }

    .room-label {
        font-size: 1.5rem;
        padding: 0.5rem;
        color: #9e9e9e;
    }

    .lower-container{
        display: flex;
        flex-direction: column;
        padding: 1rem;
        padding-bottom: 0;
        /* padding-top: 4rem; */
        height: 50%;

        .price-per-night {
            margin-top: auto;
            margin-left: auto;
            font-size: 2rem;
            font-weight: 800;
        }

        .total-price-and-rating {
            margin-top: 2rem;
            font-size: 1.5rem;
            display: flex;
            justify-content: space-between;
            & > div {
                display: inline-block;
            }

            .total-price {
                margin-right: 0;
            }

            .star-icon {
                padding-right: 0.5rem;
            }
        }
    }
`

export default RoomCard;
