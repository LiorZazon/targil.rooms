package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room[] rooms = new Room[5];
        rooms[0] = new Room();
        rooms[1] = new StandartRoom();
        rooms[2] = new VIPRoom();
        rooms[3] = new VipRoomCelebs();
        rooms[4]= new VipRoomPresident();


        // קריאה לפונקציה ולשים בה את מיקום 0 במערך
        callCleanRoom(rooms[0]);
        callCleanRoom(rooms[1]);
        callCleanRoom(rooms[2]);
        callCleanRoom(rooms[3]);
        callCleanRoom(rooms[4]);


        //צריך ליצור מופע כדי להשתמש בפונקציה על אותו מופע מאותה מחלקה יורשת
        VipRoomPresident vip_room_p = new  VipRoomPresident();
        partyAtVipRoom(vip_room_p);
        VipRoomCelebs vip_room_c = new VipRoomCelebs();
        partyAtVipRoom(vip_room_c);


    }
    public static void callCleanRoom (Room room) {
        room.cleanRoom();
    }
    public static void partyAtVipRoom (VIPRoom vip) {
        vip.party();
    }
}
