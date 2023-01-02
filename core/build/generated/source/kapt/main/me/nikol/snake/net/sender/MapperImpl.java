package me.nikol.snake.net.sender;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import me.nikol.snake.dto.SnakesProto;
import me.nikol.snake.game.model.AckMsg;
import me.nikol.snake.game.model.Coord;
import me.nikol.snake.game.model.Direction;
import me.nikol.snake.game.model.DiscoverMsg;
import me.nikol.snake.game.model.ErrorMsg;
import me.nikol.snake.game.model.GameAnnouncement;
import me.nikol.snake.game.model.GameConfig;
import me.nikol.snake.game.model.GamePlayer;
import me.nikol.snake.game.model.GamePlayers;
import me.nikol.snake.game.model.GameState;
import me.nikol.snake.game.model.JoinMsg;
import me.nikol.snake.game.model.NodeRole;
import me.nikol.snake.game.model.PingMsg;
import me.nikol.snake.game.model.PlayerType;
import me.nikol.snake.game.model.RoleChangeMsg;
import me.nikol.snake.game.model.Snake;
import me.nikol.snake.game.model.SnakeState;
import me.nikol.snake.game.model.StateMsg;
import me.nikol.snake.game.model.SteerMsg;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-12T20:25:39+0700",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.7.20.jar, environment: Java 17.0.3 (Amazon.com Inc.)"
)
public class MapperImpl extends Mapper {

    @Override
    public SnakesProto.GameMessage.RoleChangeMsg map(RoleChangeMsg msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameMessage.RoleChangeMsg.Builder roleChangeMsg = SnakesProto.GameMessage.RoleChangeMsg.newBuilder();

        if ( msg.getSenderRole() != null ) {
            roleChangeMsg.setSenderRole( nodeRoleToNodeRole( msg.getSenderRole() ) );
        }
        if ( msg.getReceiverRole() != null ) {
            roleChangeMsg.setReceiverRole( nodeRoleToNodeRole( msg.getReceiverRole() ) );
        }

        return roleChangeMsg.build();
    }

    @Override
    public SnakesProto.GameMessage.ErrorMsg map(ErrorMsg msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameMessage.ErrorMsg.Builder errorMsg = SnakesProto.GameMessage.ErrorMsg.newBuilder();

        if ( msg.getErrorMessage() != null ) {
            errorMsg.setErrorMessage( msg.getErrorMessage() );
        }

        return errorMsg.build();
    }

    @Override
    public SnakesProto.GameMessage.DiscoverMsg map(DiscoverMsg msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameMessage.DiscoverMsg.Builder discoverMsg = SnakesProto.GameMessage.DiscoverMsg.newBuilder();

        return discoverMsg.build();
    }

    @Override
    public SnakesProto.GameMessage.StateMsg map(StateMsg msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameMessage.StateMsg.Builder stateMsg = SnakesProto.GameMessage.StateMsg.newBuilder();

        if ( msg.getState() != null ) {
            stateMsg.setState( map( msg.getState() ) );
        }

        return stateMsg.build();
    }

    @Override
    public SnakesProto.GameMessage.AckMsg map(AckMsg msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameMessage.AckMsg.Builder ackMsg = SnakesProto.GameMessage.AckMsg.newBuilder();

        return ackMsg.build();
    }

    @Override
    public SnakesProto.GameMessage.SteerMsg map(SteerMsg msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameMessage.SteerMsg.Builder steerMsg = SnakesProto.GameMessage.SteerMsg.newBuilder();

        if ( msg.getDirection() != null ) {
            steerMsg.setDirection( map( msg.getDirection() ) );
        }

        return steerMsg.build();
    }

    @Override
    public SnakesProto.GameMessage.PingMsg map(PingMsg msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameMessage.PingMsg.Builder pingMsg = SnakesProto.GameMessage.PingMsg.newBuilder();

        return pingMsg.build();
    }

    @Override
    public SnakesProto.GameMessage.JoinMsg map(JoinMsg msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameMessage.JoinMsg.Builder joinMsg = SnakesProto.GameMessage.JoinMsg.newBuilder();

        if ( msg.getPlayerType() != null ) {
            joinMsg.setPlayerType( playerTypeToPlayerType( msg.getPlayerType() ) );
        }
        if ( msg.getPlayerName() != null ) {
            joinMsg.setPlayerName( msg.getPlayerName() );
        }
        if ( msg.getGameName() != null ) {
            joinMsg.setGameName( msg.getGameName() );
        }
        if ( msg.getRequestedRole() != null ) {
            joinMsg.setRequestedRole( nodeRoleToNodeRole( msg.getRequestedRole() ) );
        }

        return joinMsg.build();
    }

    @Override
    public SnakesProto.GamePlayer map(GamePlayer player) {
        if ( player == null ) {
            return null;
        }

        SnakesProto.GamePlayer.Builder gamePlayer = SnakesProto.GamePlayer.newBuilder();

        if ( player.getName() != null ) {
            gamePlayer.setName( player.getName() );
        }
        gamePlayer.setId( player.getId() );
        if ( player.getIpAddress() != null ) {
            gamePlayer.setIpAddress( player.getIpAddress() );
        }
        if ( player.getPort() != null ) {
            gamePlayer.setPort( player.getPort() );
        }
        if ( player.getRole() != null ) {
            gamePlayer.setRole( nodeRoleToNodeRole( player.getRole() ) );
        }
        if ( player.getType() != null ) {
            gamePlayer.setType( playerTypeToPlayerType( player.getType() ) );
        }
        gamePlayer.setScore( player.getScore() );

        return gamePlayer.build();
    }

    @Override
    public SnakesProto.GameConfig map(GameConfig gameConfig) {
        if ( gameConfig == null ) {
            return null;
        }

        SnakesProto.GameConfig.Builder gameConfig1 = SnakesProto.GameConfig.newBuilder();

        gameConfig1.setWidth( gameConfig.getWidth() );
        gameConfig1.setHeight( gameConfig.getHeight() );
        gameConfig1.setFoodStatic( gameConfig.getFoodStatic() );
        gameConfig1.setStateDelayMs( gameConfig.getStateDelayMs() );

        return gameConfig1.build();
    }

    @Override
    public SnakesProto.GameAnnouncement map(GameAnnouncement announcement) {
        if ( announcement == null ) {
            return null;
        }

        SnakesProto.GameAnnouncement.Builder gameAnnouncement = SnakesProto.GameAnnouncement.newBuilder();

        if ( announcement.getPlayers() != null ) {
            gameAnnouncement.setPlayers( map( announcement.getPlayers() ) );
        }
        if ( announcement.getConfig() != null ) {
            gameAnnouncement.setConfig( map( announcement.getConfig() ) );
        }
        gameAnnouncement.setCanJoin( announcement.getCanJoin() );
        if ( announcement.getGameName() != null ) {
            gameAnnouncement.setGameName( announcement.getGameName() );
        }

        return gameAnnouncement.build();
    }

    @Override
    public AckMsg map(SnakesProto.GameMessage.AckMsg msg) {
        if ( msg == null ) {
            return null;
        }

        AckMsg ackMsg = new AckMsg();

        return ackMsg;
    }

    @Override
    public GamePlayer map(SnakesProto.GamePlayer player) {
        if ( player == null ) {
            return null;
        }

        String name = null;
        int id = 0;
        String ipAddress = null;
        Integer port = null;
        NodeRole role = null;
        PlayerType type = null;
        int score = 0;

        if ( player.hasName() ) {
            name = player.getName();
        }
        if ( player.hasId() ) {
            id = player.getId();
        }
        if ( player.hasIpAddress() ) {
            ipAddress = player.getIpAddress();
        }
        if ( player.hasPort() ) {
            port = player.getPort();
        }
        if ( player.hasRole() ) {
            role = nodeRoleToNodeRole1( player.getRole() );
        }
        if ( player.hasType() ) {
            type = playerTypeToPlayerType1( player.getType() );
        }
        if ( player.hasScore() ) {
            score = player.getScore();
        }

        GamePlayer gamePlayer = new GamePlayer( name, id, ipAddress, port, role, type, score );

        return gamePlayer;
    }

    @Override
    public GameConfig map(SnakesProto.GameConfig gameConfig) {
        if ( gameConfig == null ) {
            return null;
        }

        int foodStatic = 0;
        int stateDelayMs = 0;
        int height = 0;
        int width = 0;

        if ( gameConfig.hasFoodStatic() ) {
            foodStatic = gameConfig.getFoodStatic();
        }
        if ( gameConfig.hasStateDelayMs() ) {
            stateDelayMs = gameConfig.getStateDelayMs();
        }
        if ( gameConfig.hasHeight() ) {
            height = gameConfig.getHeight();
        }
        if ( gameConfig.hasWidth() ) {
            width = gameConfig.getWidth();
        }

        GameConfig gameConfig1 = new GameConfig( width, height, foodStatic, stateDelayMs );

        return gameConfig1;
    }

    @Override
    public GameAnnouncement map(SnakesProto.GameAnnouncement announcement) {
        if ( announcement == null ) {
            return null;
        }

        GamePlayers players = null;
        GameConfig config = null;
        boolean canJoin = false;
        String gameName = null;

        if ( announcement.hasPlayers() ) {
            players = map( announcement.getPlayers() );
        }
        if ( announcement.hasConfig() ) {
            config = map( announcement.getConfig() );
        }
        if ( announcement.hasCanJoin() ) {
            canJoin = announcement.getCanJoin();
        }
        if ( announcement.hasGameName() ) {
            gameName = announcement.getGameName();
        }

        GameAnnouncement gameAnnouncement = new GameAnnouncement( players, config, canJoin, gameName );

        return gameAnnouncement;
    }

    @Override
    public DiscoverMsg map(SnakesProto.GameMessage.DiscoverMsg msg) {
        if ( msg == null ) {
            return null;
        }

        DiscoverMsg discoverMsg = new DiscoverMsg();

        return discoverMsg;
    }

    @Override
    public ErrorMsg map(SnakesProto.GameMessage.ErrorMsg msg) {
        if ( msg == null ) {
            return null;
        }

        String errorMessage = null;

        if ( msg.hasErrorMessage() ) {
            errorMessage = msg.getErrorMessage();
        }

        ErrorMsg errorMsg = new ErrorMsg( errorMessage );

        return errorMsg;
    }

    @Override
    public StateMsg map(SnakesProto.GameMessage.StateMsg msg) {
        if ( msg == null ) {
            return null;
        }

        GameState state = null;

        if ( msg.hasState() ) {
            state = map( msg.getState() );
        }

        StateMsg stateMsg = new StateMsg( state );

        return stateMsg;
    }

    @Override
    public JoinMsg map(SnakesProto.GameMessage.JoinMsg msg) {
        if ( msg == null ) {
            return null;
        }

        PlayerType playerType = null;
        String playerName = null;
        String gameName = null;
        NodeRole requestedRole = null;

        if ( msg.hasPlayerType() ) {
            playerType = playerTypeToPlayerType1( msg.getPlayerType() );
        }
        if ( msg.hasPlayerName() ) {
            playerName = msg.getPlayerName();
        }
        if ( msg.hasGameName() ) {
            gameName = msg.getGameName();
        }
        if ( msg.hasRequestedRole() ) {
            requestedRole = nodeRoleToNodeRole1( msg.getRequestedRole() );
        }

        JoinMsg joinMsg = new JoinMsg( playerType, playerName, gameName, requestedRole );

        return joinMsg;
    }

    @Override
    public RoleChangeMsg map(SnakesProto.GameMessage.RoleChangeMsg msg) {
        if ( msg == null ) {
            return null;
        }

        NodeRole senderRole = null;
        NodeRole receiverRole = null;

        if ( msg.hasSenderRole() ) {
            senderRole = nodeRoleToNodeRole1( msg.getSenderRole() );
        }
        if ( msg.hasReceiverRole() ) {
            receiverRole = nodeRoleToNodeRole1( msg.getReceiverRole() );
        }

        RoleChangeMsg roleChangeMsg = new RoleChangeMsg( senderRole, receiverRole );

        return roleChangeMsg;
    }

    @Override
    public PingMsg map(SnakesProto.GameMessage.PingMsg msg) {
        if ( msg == null ) {
            return null;
        }

        PingMsg pingMsg = new PingMsg();

        return pingMsg;
    }

    @Override
    public SteerMsg map(SnakesProto.GameMessage.SteerMsg msg) {
        if ( msg == null ) {
            return null;
        }

        Direction direction = null;

        if ( msg.hasDirection() ) {
            direction = directionToDirection( msg.getDirection() );
        }

        SteerMsg steerMsg = new SteerMsg( direction );

        return steerMsg;
    }

    @Override
    public Snake map(SnakesProto.GameState.Snake msg) {
        if ( msg == null ) {
            return null;
        }

        Direction direction = null;
        List<Coord> points = null;
        int playerId = 0;
        SnakeState state = null;

        if ( msg.hasHeadDirection() ) {
            direction = directionToDirection( msg.getHeadDirection() );
        }
        List<Coord> list = mapFrom( msg.getPointsList() );
        if ( list != null ) {
            points = list;
        }
        if ( msg.hasPlayerId() ) {
            playerId = msg.getPlayerId();
        }
        if ( msg.hasState() ) {
            state = snakeStateToSnakeState( msg.getState() );
        }

        Snake snake = new Snake( playerId, points, state, direction );

        return snake;
    }

    @Override
    public GameState map(SnakesProto.GameState state) {
        if ( state == null ) {
            return null;
        }

        List<Coord> foods = null;
        List<Snake> snakes = null;
        int stateOrder = 0;
        GamePlayers players = null;

        List<Coord> list = mapFrom( state.getFoodsList() );
        if ( list != null ) {
            foods = list;
        }
        List<Snake> list1 = snakeListToSnakeList( state.getSnakesList() );
        if ( list1 != null ) {
            snakes = list1;
        }
        if ( state.hasStateOrder() ) {
            stateOrder = state.getStateOrder();
        }
        if ( state.hasPlayers() ) {
            players = map( state.getPlayers() );
        }

        GameState gameState = new GameState( stateOrder, snakes, foods, players );

        return gameState;
    }

    @Override
    public Coord map(SnakesProto.GameState.Coord msg) {
        if ( msg == null ) {
            return null;
        }

        int x = 0;
        int y = 0;

        if ( msg.hasX() ) {
            x = msg.getX();
        }
        if ( msg.hasY() ) {
            y = msg.getY();
        }

        Coord coord = new Coord( x, y );

        return coord;
    }

    @Override
    public SnakesProto.GameState.Coord map(Coord msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameState.Coord.Builder coord = SnakesProto.GameState.Coord.newBuilder();

        coord.setX( msg.getX() );
        coord.setY( msg.getY() );

        return coord.build();
    }

    @Override
    public SnakesProto.GameState.Snake.SnakeState map(SnakeState msg) {
        if ( msg == null ) {
            return null;
        }

        SnakesProto.GameState.Snake.SnakeState snakeState;

        switch ( msg ) {
            case ALIVE: snakeState = SnakesProto.GameState.Snake.SnakeState.ALIVE;
            break;
            case ZOMBIE: snakeState = SnakesProto.GameState.Snake.SnakeState.ZOMBIE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + msg );
        }

        return snakeState;
    }

    @Override
    public SnakesProto.Direction map(Direction direction) {
        if ( direction == null ) {
            return null;
        }

        SnakesProto.Direction direction1;

        switch ( direction ) {
            case UP: direction1 = SnakesProto.Direction.UP;
            break;
            case DOWN: direction1 = SnakesProto.Direction.DOWN;
            break;
            case LEFT: direction1 = SnakesProto.Direction.LEFT;
            break;
            case RIGHT: direction1 = SnakesProto.Direction.RIGHT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + direction );
        }

        return direction1;
    }

    protected SnakesProto.NodeRole nodeRoleToNodeRole(NodeRole nodeRole) {
        if ( nodeRole == null ) {
            return null;
        }

        SnakesProto.NodeRole nodeRole1;

        switch ( nodeRole ) {
            case NORMAL: nodeRole1 = SnakesProto.NodeRole.NORMAL;
            break;
            case MASTER: nodeRole1 = SnakesProto.NodeRole.MASTER;
            break;
            case DEPUTY: nodeRole1 = SnakesProto.NodeRole.DEPUTY;
            break;
            case VIEWER: nodeRole1 = SnakesProto.NodeRole.VIEWER;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + nodeRole );
        }

        return nodeRole1;
    }

    protected SnakesProto.PlayerType playerTypeToPlayerType(PlayerType playerType) {
        if ( playerType == null ) {
            return null;
        }

        SnakesProto.PlayerType playerType1;

        switch ( playerType ) {
            case HUMAN: playerType1 = SnakesProto.PlayerType.HUMAN;
            break;
            case ROBOT: playerType1 = SnakesProto.PlayerType.ROBOT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + playerType );
        }

        return playerType1;
    }

    protected NodeRole nodeRoleToNodeRole1(SnakesProto.NodeRole nodeRole) {
        if ( nodeRole == null ) {
            return null;
        }

        NodeRole nodeRole1;

        switch ( nodeRole ) {
            case NORMAL: nodeRole1 = NodeRole.NORMAL;
            break;
            case MASTER: nodeRole1 = NodeRole.MASTER;
            break;
            case DEPUTY: nodeRole1 = NodeRole.DEPUTY;
            break;
            case VIEWER: nodeRole1 = NodeRole.VIEWER;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + nodeRole );
        }

        return nodeRole1;
    }

    protected PlayerType playerTypeToPlayerType1(SnakesProto.PlayerType playerType) {
        if ( playerType == null ) {
            return null;
        }

        PlayerType playerType1;

        switch ( playerType ) {
            case HUMAN: playerType1 = PlayerType.HUMAN;
            break;
            case ROBOT: playerType1 = PlayerType.ROBOT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + playerType );
        }

        return playerType1;
    }

    protected Direction directionToDirection(SnakesProto.Direction direction) {
        if ( direction == null ) {
            return null;
        }

        Direction direction1;

        switch ( direction ) {
            case UP: direction1 = Direction.UP;
            break;
            case DOWN: direction1 = Direction.DOWN;
            break;
            case LEFT: direction1 = Direction.LEFT;
            break;
            case RIGHT: direction1 = Direction.RIGHT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + direction );
        }

        return direction1;
    }

    protected SnakeState snakeStateToSnakeState(SnakesProto.GameState.Snake.SnakeState snakeState) {
        if ( snakeState == null ) {
            return null;
        }

        SnakeState snakeState1;

        switch ( snakeState ) {
            case ALIVE: snakeState1 = SnakeState.ALIVE;
            break;
            case ZOMBIE: snakeState1 = SnakeState.ZOMBIE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + snakeState );
        }

        return snakeState1;
    }

    protected List<Snake> snakeListToSnakeList(List<SnakesProto.GameState.Snake> list) {
        if ( list == null ) {
            return null;
        }

        List<Snake> list1 = new ArrayList<Snake>( list.size() );
        for ( SnakesProto.GameState.Snake snake : list ) {
            list1.add( map( snake ) );
        }

        return list1;
    }
}
