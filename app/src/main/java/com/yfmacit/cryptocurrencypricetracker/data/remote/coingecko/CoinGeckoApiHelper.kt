package com.yfmacit.cryptocurrencypricetracker.data.remote.coingecko

import com.google.gson.JsonObject
import com.yfmacit.cryptocurrencypricetracker.data.model.api.list.CoinListItem
import com.yfmacit.cryptocurrencypricetracker.data.model.api.detail.GetCoinDetailResponse
import io.reactivex.Observable

interface CoinGeckoApiHelper {
    fun getCoinListImpl() : Observable<ArrayList<CoinListItem>>
    fun getCoinDetailImpl(coinId: String) : Observable<GetCoinDetailResponse>
    fun getCoinSimplePrice(coinId: String) : Observable<JsonObject>
}