package com.restaurants.dtoconversion;

import com.restaurants.entities.FoodCategory;
import com.restaurants.entities.FoodItem;
import com.restaurants.entities.Restaurant;
import com.restaurants.dto.indto.FoodCategoryInDto;
import com.restaurants.dto.indto.FoodItemInDto;
import com.restaurants.dto.indto.RestaurantInDto;
import com.restaurants.dto.outdto.FoodCategoryOutDto;
import com.restaurants.dto.outdto.FoodItemOutDto;
import com.restaurants.dto.outdto.RestaurantOutDto;

/**
 * Utility class for converting between entity objects and DTOs.
 */
public final class DtoConversion {

  /**
   * Converts a {@link RestaurantInDto} to a {@link Restaurant} entity.
   *
   * @param request the {@link RestaurantInDto} containing restaurant details
   * @return the corresponding {@link Restaurant} entity
   */
  public static Restaurant convertRestaurantRequestToRestaurant(RestaurantInDto request){
    Restaurant restaurant=new Restaurant();
    restaurant.setRestaurantName(request.getRestaurantName());
    restaurant.setAddress(request.getAddress());
    restaurant.setUserId(request.getUserId());
    restaurant.setOpeningHours(request.getOpeningHours());
    restaurant.setContactNumber(request.getContactNumber());
    return restaurant;
  }

  /**
   * Converts a {@link Restaurant} entity to a {@link RestaurantOutDto}.
   *
   * @param restaurant the {@link Restaurant} entity to convert
   * @return the corresponding {@link RestaurantOutDto}
   */
  public static RestaurantOutDto convertRestaurantToRestaurantResponse(Restaurant restaurant){
    RestaurantOutDto response=new RestaurantOutDto();
    response.setId(restaurant.getId());
    response.setAddress(restaurant.getAddress());
    response.setContactNumber(restaurant.getContactNumber());
    response.setRestaurantName(restaurant.getRestaurantName());
    response.setOpeningHours(restaurant.getOpeningHours());
    response.setImageData(restaurant.getImageData());
    response.setUserId(restaurant.getUserId());
    return response;
  }

  /**
   * Converts a {@link FoodCategoryInDto} to a {@link FoodCategory} entity.
   *
   * @param request the {@link FoodCategoryInDto} containing food category details
   * @return the corresponding {@link FoodCategory} entity
   */
  public static FoodCategory convertCategoryRequestToCategory(FoodCategoryInDto request){
    FoodCategory category=new FoodCategory();
    category.setCategoryName(request.getCategoryName());
    category.setRestaurantId(request.getRestaurantId());
    return category;
  }

  /**
   * Converts a {@link FoodCategory} entity to a {@link FoodCategoryOutDto}.
   *
   * @param category the {@link FoodCategory} entity to convert
   * @return the corresponding {@link FoodCategoryOutDto}
   */
  public static FoodCategoryOutDto convertCategoryToResponse(FoodCategory category){
    FoodCategoryOutDto response=new FoodCategoryOutDto();
    response.setId(category.getId());
    response.setCategoryName(category.getCategoryName());
    response.setRestaurantId(category.getRestaurantId());
    return response;
  }

  /**
   * Converts a {@link FoodItemInDto} to a {@link FoodItem} entity.
   *
   * @param request the {@link FoodItemInDto} containing food item details
   * @return the corresponding {@link FoodItem} entity
   */
  public static FoodItem convertFoodItemRequestToFoodItem(FoodItemInDto request){
    FoodItem items=new FoodItem();
    items.setCategoryId(request.getCategoryId());
    items.setDescription(request.getDescription());
    items.setPrice(request.getPrice());
    items.setIsVeg(request.getIsVeg());
    items.setItemName(request.getItemName());
    items.setRestaurantId(request.getRestaurantId());
    return items;
    }

  /**
   * Converts a {@link FoodItem} entity to a {@link FoodItemOutDto}.
   *
   * @param items the {@link FoodItem} entity to convert
   * @return the corresponding {@link FoodItemOutDto}
   */
  public static FoodItemOutDto convertFoodItemToFoodItemResponse(FoodItem items){
    FoodItemOutDto response=new FoodItemOutDto();
    response.setId(items.getId());
    response.setCategoryId(items.getCategoryId());
    response.setDescription(items.getDescription());
    response.setPrice(items.getPrice());
    response.setIsVeg(items.getIsVeg());
    response.setImageData(items.getImageData());
    response.setItemName(items.getItemName());
    response.setRestaurantId(items.getRestaurantId());

    return response;
  }

  /**
   * Updates an existing {@link FoodItem} entity with data from a {@link FoodItemInDto}.
   *
   * @param request the {@link FoodItemInDto} containing updated food item details
   * @param existingItem the existing {@link FoodItem} entity to be updated
   * @return the updated {@link FoodItem} entity
   */
  public static FoodItem updateFoodItemRequest(FoodItemInDto request, FoodItem existingItem){
    existingItem.setDescription(request.getDescription());
    existingItem.setItemName(request.getItemName());
    existingItem.setPrice(request.getPrice());
    existingItem.setIsVeg(request.getIsVeg());
    return existingItem;
  }
}