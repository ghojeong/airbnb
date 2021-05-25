import { ActionKind } from "util/enum";

export type CalendarState = {
  checkInMonth: number;
  checkInDate: number;
  checkOutDate: number;
  checkOutMonth: number;
};

export type PriceState = {
  min: number;
  max: number;
};

export type GuestsState = {
  adult: number;
  child: number;
  toddler: number;
};

export type PriceAction =
  | { type: ActionKind.setPriceMin; payload: number }
  | { type: ActionKind.setPriceMax; payload: number }
  | { type: ActionKind.reset };

export type CalendarAction =
  | { type: ActionKind.setCheckInMonth; payload: number }
  | { type: ActionKind.setCheckInDate; payload: number }
  | { type: ActionKind.setCheckOutMonth; payload: number }
  | { type: ActionKind.setCheckOutDate; payload: number }
  | { type: ActionKind.reset };

export type GuestsAction =
  | { type: ActionKind.setGuestsAdult; payload: number }
  | { type: ActionKind.setGuestsChild; payload: number }
  | { type: ActionKind.setGuestsToddler; payload: number }
  | { type: ActionKind.reset };
