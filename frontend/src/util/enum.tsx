export enum FilterKind {
  checkIn = "CHECK_IN",
  checkOut = "CHECK_OUT",
  price = "PRICE",
  guests = "GUESTS",
}

export enum ActionKind {
  setCheckInMonth = "SET_CHECK_IN_MONTH",
  setCheckInDate = "SET_CHECK_IN_DATE",
  setCheckOutMonth = "SET_CHECK_OUT_MONTH",
  setCheckOutDate = "SET_CHECK_OUT_DATE",
  setPriceMin = "SET_PRICE_MIN",
  setPriceMax = "SET_PRICE_MAX",
  setGuestsAdult = "SET_GUESTS_ADULT",
  setGuestsChild = "SET_GUESTS_CHILD",
  setGuestsToddler = "SET_GUESTS_TODDLER",
  reset = "RESET",
}
